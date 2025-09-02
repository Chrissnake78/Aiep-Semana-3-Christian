# Historias de Usuario

## HU1: Cliente compra con despacho gratis
**Como** cliente,  
**quiero** ingresar mis datos de compra y ver que el despacho es gratis cuando gasto más de $50.000 y estoy dentro de 20 km,  
**para** sentir confianza en la promoción de la empresa.  
✔ Criterio de aceptación: si el monto ≥ 50.000 y distancia ≤ 20 km, el costo de despacho = 0.

## HU2: Cliente paga despacho reducido
**Como** cliente,  
**quiero** que el sistema calcule $150/km cuando mi compra está entre 25.000 y 49.999,  
**para** saber el costo exacto antes de confirmar.  
✔ Criterio de aceptación: monto entre 25.000 y 49.999, costo = distancia * 150.

## HU3: Cliente paga despacho completo
**Como** cliente,  
**quiero** conocer el costo a $300/km cuando mi compra es menor a 25.000,  
**para** evaluar si me conviene el despacho.  
✔ Criterio de aceptación: monto < 25.000, costo = distancia * 300.

## HU4: Registro con Gmail
**Como** cliente,  
**quiero** iniciar sesión con mi cuenta Gmail,  
**para** simplificar mi registro en la aplicación.  
✔ Criterio de aceptación: botón Gmail presente en el formulario.