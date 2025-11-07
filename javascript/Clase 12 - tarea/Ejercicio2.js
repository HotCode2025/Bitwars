// Ejercicio 2: Crear un sistema simple de gestión de tareas
function createTaskManager() {
    let tasks = [];
    let nextId = 1; // Para IDs únicos
    
    return {
        addTask: function(taskText) {
            const newTask = {
                id: nextId,
                text: taskText,
                completed: false
            };
            tasks.push(newTask);
            nextId++;
        },

        completeTask: function(taskId) {
            // Busca la tarea por su ID
            const task = tasks.find(t => t.id === taskId);
            
            if (task) {
                task.completed = true;
            } else {
                console.log(`Error: Tarea ID ${taskId} no encontrada.`);
            }
        },

        listTasks: function() {
            console.log("\n--- LISTA DE TAREAS ---");
            if (tasks.length === 0) {
                console.log("(No hay tareas)");
                return;
            }
            
            tasks.forEach(task => {
                const status = task.completed ? '[X]' : '[ ]';
                console.log(`${task.id}. ${status} ${task.text}`);
            });
        }
    };
}

// --- Uso ---
const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");
myTasks.addTask("Comprar comida");

myTasks.listTasks();
//  LISTA DE TAREAS
// 1. [ ] Aprender JavaScript
// 2. [ ] Hacer ejercicio
// 3. [ ] Comprar comida

// Completar la tarea 2
myTasks.completeTask(2);

// Mostrar la lista actualizada
myTasks.listTasks();
// --- LISTA DE TAREAS ---
// 1. [ ] Aprender JavaScript
// 2. [X] Hacer ejercicio
// 3. [ ] Comprar comida