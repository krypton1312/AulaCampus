New-Item -Path "./MiNuevaCarpeta" -ItemType Directory

New-Item -Path "./archivo.txt" -ItemType File

Copy-Item -Path "./archivo.txt" -Destination "./MiNuevaCarpeta"

Get-ChildItem -Path "./MiNuevaCarpeta"