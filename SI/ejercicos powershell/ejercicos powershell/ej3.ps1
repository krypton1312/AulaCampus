$name = Read-Host "Introduce el nombre de usario"
$password = Read-Host "Introduce la contraseña" -AsSecureString
New-LocalUser -Name $name -Password $password -Description "ej3"
Add-LocalGroupMember -Group "ejercicios powershell" -Member $name