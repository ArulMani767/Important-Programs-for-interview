# Maven Build Script for Important Programs
# This project now uses Maven for dependency management and builds

$root = Get-Location
$mvnHome = $env:M2_HOME
$javaBin = $env:JAVA_HOME

# Check if Maven is available
$mvnCmd = if (Get-Command mvn -ErrorAction SilentlyContinue) { 'mvn' } else { $null }

if (-Not $mvnCmd) {
    Write-Host "⚠️  Maven not found in PATH" -ForegroundColor Yellow
    Write-Host "Please install Maven:"
    Write-Host "1. Download from https://maven.apache.org/download.cgi"
    Write-Host "2. Extract to a folder"
    Write-Host "3. Add bin folder to your PATH environment variable"
    Write-Host "4. Run this script again"
    exit 1
}

Write-Host "📦 Building with Maven..." -ForegroundColor Cyan
& mvn clean compile

if ($LASTEXITCODE -eq 0) {
    Write-Host "✅ Build completed successfully!" -ForegroundColor Green
    Write-Host "Output: target/classes" -ForegroundColor Green
} else {
    Write-Host "❌ Build failed. Check errors above." -ForegroundColor Red
    exit 1
}
