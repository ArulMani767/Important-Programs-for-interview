# Build script: compiles all Java sources under src into bin with lint
$root = Get-Location
$src = Join-Path $root 'src'
$bin = Join-Path $root 'bin'
if (-Not (Test-Path $bin)) { New-Item -ItemType Directory -Path $bin | Out-Null }
$files = Get-ChildItem -Path $src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
if ($files) {
    javac -d $bin -Xlint:all $files
    if ($LASTEXITCODE -eq 0) {
        Write-Output 'Build completed successfully.'
    } else {
        Write-Output 'Build finished with warnings/errors. Check output above.'
    }
} else {
    Write-Output 'No Java files found to compile.'
}
