$diasSemana = @("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

foreach ($dia in $diasSemana) {
    Write-Host $dia -ForegroundColor Cyan -BackgroundColor Black 
}
