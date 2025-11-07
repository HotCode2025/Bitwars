//let persona3 = new Persona('Carla', 'Ponce'); //Esto no se debe hacer: Persona is not defined

class Persona{ //Clase padre
    static contadorPersonas = 0; //Atributo estático
    email = 'Valor default email'; //Atributo no estático
    
    static get MAX_OBJ(){
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se han superado el máximo de objetos permitidos');
        }
        
        //console.log('Se incrementa el contador: '+ Persona.contadorPersonas);
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona + ': ' + this._nombre + ' ' + this._apellido;
    }
    
    //Sobreescribiendo el método de la clase padre (Object)
    toString(){ //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //El método que se ejecuta depende si es una referencia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('Saludos desde este método static');
    }

    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}


let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.toString());

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.toString());

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1.toString());

console.log(Persona.contadorPersonas);
console.log(Empleado.contadorPersonas);

console.log(Persona.MAX_OBJ);
Persona.MAX_OBJ = 10;
console.log(Persona.MAX_OBJ);

let persona3 = new Persona('Armando', 'Paredes');
console.log(persona3.toString());
let persona4 = new Persona('Romina', 'Diaz');
console.log(persona4.toString());

let persona5 = new Persona('Laura', 'Quintero');
console.log(persona5.toString());