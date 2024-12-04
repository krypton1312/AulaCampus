$num = Read-Host "Introduce un numero positivo"
$num = [int]$num

for ($i = 1; $i -le $num; $i++)
{ 
    Write-Host $i
}