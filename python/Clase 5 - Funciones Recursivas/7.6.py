"""
Ejercicio: Calculadora de Impuestos

Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)

Fórmula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)

- Proporcione el pago sin impuesto: Ejemplo: 1000
- Proporcione el monto del impuesto: 21%
Pago con impuesto: $1210
"""

def calcularImpuesto(monto, impuesto):
    pago_sin_impuesto = monto
    pagoTotal = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    
    print(f"Pago sin impuestos: {pago_sin_impuesto}")
    print(f"Pago con impuestos {impuesto}%: {pagoTotal}$")

calcularImpuesto(1000, 21)