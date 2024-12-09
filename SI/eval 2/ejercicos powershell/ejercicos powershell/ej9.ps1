do{

Write-Host "`nElige una operación:"
Write-Host "1. Suma"
Write-Host "2. Resta"
Write-Host "3. Multiplicación"
Write-Host "4. División"
Write-Host "5. Resto (Módulo)"
Write-Host "6. Salir "

$opcion = Read-Host "`nIntroduce el número de la operación que deseas realizar (1-6)"

$num1 = Read-Host "Introduce el primer número"
$num1 = [int]$num1
$num2 = Read-Host "Introduce el segundo número"
$num2 = [int]$num2

switch ($opcion) {
    "1" {
        $resultado = $num1 + $num2
        Write-Host "`nResultado: $num1 + $num2 = $resultado" -ForegroundColor Yellow
    }
    "2" {
        $resultado = $num1 - $num2
        Write-Host "`nResultado: $num1 - $num2 = $resultado" -ForegroundColor Yellow
    }
    "3" {
        $resultado = $num1 * $num2
        Write-Host "`nResultado: $num1 * $num2 = $resultado" -ForegroundColor Yellow
    }
    "4" {
        if ($num2 -ne 0) {
            $resultado = $num1 / $num2
            Write-Host "`nResultado: $num1 / $num2 = $resultado" -ForegroundColor Yellow
        } else {
            Write-Host "`nError: No se puede dividir entre 0" -ForegroundColor Red
        }
    }
    "5" {
        if ($num2 -ne 0) {
            $resultado = $num1 % $num2
            Write-Host "`nResultado: $num1 % $num2 = $resultado" -ForegroundColor Yellow
        } else {
            Write-Host "`nError: No se puede calcular el resto con divisor 0" -ForegroundColor Red
            }
        }
    "6" {break}
    }
}while($opcion -ne 6)