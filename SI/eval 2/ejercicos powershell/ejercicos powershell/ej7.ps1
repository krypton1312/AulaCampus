do{
Write-Host "=== Menu ==="
Write-Host "Elige una opcion`n1.Listar grupos`n2.Ver miembros de un grupo`n3.Crear grupo`n4.Elimina grupo`n5.Crea miembro de un grupo`n6.Elimina miembro de un grupo`n7.Salir"
$option = Read-Host "Seleccione opcion"

switch($option){
    1 {Get-LocalGroup}
    2 {
        $name = Read-Host "Introduce un nombre de grupo"
        Get-LocalGroupMember -Name $name
        }
    3 {
        $name = Read-Host "Introduce el nombre de grupo"
        New-LocalGroup -Name $name
        }
    4 {
        $name = Read-Host "Introduce el nombre de grupo"
        Remove-LocalGroup -Name $name 
        }
    5 {
        $name = Read-Host "Introduce el nombre de usario"
        $group = Read-Host "Introduce un grupo"
        New-LocalUser -Name $nombre -NoPassword -Description " "
        Add-LocalGroupMember -Group $group -Member $name
        }
    6 {
        $name = Read-Host "Introduce el nombre de usario"
        $group = Read-Host "Introduce un grupo"
        Remove-LocalGroupMember -Group $group -Member $name
        }
    7 {break}
}
}while($option -ne 7)