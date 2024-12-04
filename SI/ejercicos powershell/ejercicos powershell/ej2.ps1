$name = Read-Host "Introduce el nombre de usario"
$password = Read-Host "Introduce la contraseña" -AsSecureString
New-LocalUser -Name $name -Password $password -Description "ej2"