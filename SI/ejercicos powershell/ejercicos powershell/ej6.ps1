do{
Write-Host "=== Menu ==="
Write-Host "Elige una opcion`n1.Listar usarios`n2.Crear usarios`n3.Elimina usarios`n4.Modifica usarios`n5.Salir"
$option = Read-Host "Seleccione opcion"

switch($option){
    1 {Get-LocalUser}
    2 {
        $name = Read-Host "Introduce el nombre de usario"
        $password = Read-Host "Introduce la contraseña" -AsSecureString
        New-LocalUser -Name $name -Password $password -Description " "
        }
    3 {
        $name = Read-Host "Introduce el nombre de usario"
        Remove-LocalUser -Name $name 
        }
    4 {
        $name = Read-Host "Introduce el nombre de usario existente"
        $newDescription = Read-Host "Introduce nueva descripcion"
        Set-LocalUser -Name $name -Description $newDescription
        }
    5{$finish = false
        break}
}
}while($option -ne 5)
