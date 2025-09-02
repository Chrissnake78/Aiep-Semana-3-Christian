# Proyecto Despacho — Taller Aplicaciones Móviles

## Requerimientos funcionales
1. El sistema debe permitir el ingreso de datos del vehículo (marca, modelo, cilindrada, combustible, capacidad).
2. El sistema debe permitir al usuario ingresar sus datos personales (nombre, dirección, teléfono, email).
3. El sistema debe solicitar el total de la compra y la distancia en km.
4. El sistema debe calcular automáticamente el costo de despacho:
   - Compras ≥ $50.000 y distancia ≤ 20 km → despacho gratis.
   - Compras entre $25.000 y $49.999 → $150 por km.
   - Compras menores a $25.000 → $300 por km.
5. El sistema debe mostrar un resumen con todos los datos ingresados y el costo calculado.
6. El formulario web debe simular inicio de sesión con Gmail.

## Requerimientos no funcionales
1. La aplicación debe ser sencilla y fácil de usar.
2. El código debe estar documentado línea por línea.
3. El sistema debe ser accesible desde GitHub Pages con una URL pública.
4. El proyecto debe estar organizado en carpetas (`src`, `docs`, `evidencia`, `formulario`).
5. El cronograma y las evidencias deben mantenerse actualizados en el repositorio.

## Organización del repositorio
- `src/Despacho.java` → programa en Java (consola).
- `docs/DocumentacionLineaPorLinea.md` → explicación línea por línea.
- `docs/Cronograma.md` → cronograma inicial.
- `docs/HistoriasUsuario.md` → historias de usuario.
- `formulario/index.html` → formulario web con cálculo automático.
- `evidencia/` → capturas de pruebas.