do{
Write-Host "=== Menu ==="
Write-Host "Elige una opcion`n1.Mostrar informacion simple de todos los adaptadores de red`n2.Mostrar informacion detallada de un adaptador`3.Activar/desactivad adaptador`n4.Salir"
$option = Read-Host "Seleccione opcion"

switch($option){
    1 {
        Get-NetAdapter | Select-Object Name, Status, LinkSpeed
        }
    2 { 
        $adapterName = Read-Host "Introdce el nombre del adaptador"
        Get-NetAdapter -Name $adapterName
        }
    3 {
        $adapterName = Read-Host "Introduce el nombre del adaptador"
        $action = Read-Host "Activar o Desactivar(A/D)"
        if($action -eq "A"){
            Enable-NetAdapter -Name $adapterName
        }elseif($action -eq "D"){
            Disable-NetAdapter -Name $adapterName
            }
       }
     4 {break}
}
}while($option -ne 4)
        

        