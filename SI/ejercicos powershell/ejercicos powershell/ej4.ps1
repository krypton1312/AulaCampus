$name = Read-Host "Introduce el nombre de usario existente"
$newDescription = Read-Host "Introduce nueva descripcion"
Set-LocalUser -Name $name -Description $newDescription