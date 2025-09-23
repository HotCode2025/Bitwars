const persona = {
  nombre: 'Francesco',
  apellido: 'Cornachione'
}

console.log(persona);

function cambiarValorObjeto(p1){
  p1.nombre = 'Ignacio';
  p1.apellido = 'González';
}

cambiarValorObjeto(persona);
console.log(persona);