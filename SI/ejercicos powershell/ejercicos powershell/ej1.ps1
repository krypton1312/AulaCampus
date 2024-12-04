$nombre = Read-Host "Introduce el nombre de usario: "
New-LocalUser -Name $nombre -NoPassword -Description "ej1"
