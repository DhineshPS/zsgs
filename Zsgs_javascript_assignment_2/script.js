document.addEventListener("DOMContentLoaded", loadTasks);

function addTask() {
    let taskInput = document.getElementById("taskInput").value.trim();
    let dueDate = document.getElementById("dueDateInput").value;
    let priority = document.getElementById("prioritySelect").value;
    let category = document.getElementById("categorySelect").value;

    if (taskInput === "") {
        alert("Please enter a task!");
        return;
    }

    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    let newTask = { text: taskInput, dueDate, priority, category, completed: false };
    tasks.push(newTask);

    localStorage.setItem("tasks", JSON.stringify(tasks));
    document.getElementById("taskInput").value = "";
    document.getElementById("dueDateInput").value = "";

    loadTasks();
}

function toggleTask(index) {
    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
    tasks[index].completed = !tasks[index].completed;

    localStorage.setItem("tasks", JSON.stringify(tasks));
    loadTasks();
}

function editTask(index) {
    let tasks = JSON.parse(localStorage.getItem("tasks"));

    let newTaskText = prompt("Edit Task:", tasks[index].text);
    let newDueDate = prompt("Edit Due Date (YYYY-MM-DD):", tasks[index].dueDate);
    let newPriority = prompt("Edit Priority (Low, Medium, High):", tasks[index].priority);
    let newCategory = prompt("Edit Category (Work, Personal, Urgent):", tasks[index].category);

    if (newTaskText !== null) 
        tasks[index].text = newTaskText;
    if (newDueDate !== null) 
        tasks[index].dueDate = newDueDate;
    if (newPriority !== null) 
        tasks[index].priority = newPriority;
    if (newCategory !== null) 
        tasks[index].category = newCategory;

    localStorage.setItem("tasks", JSON.stringify(tasks));
    loadTasks();
}

function loadTasks() {
    let taskList = document.getElementById("taskList");
    taskList.innerHTML = "";

    let tasks = JSON.parse(localStorage.getItem("tasks")) || [];

    tasks.forEach((task, index) => {
        let li = document.createElement("li");
        li.classList.add("task-item");
        if (task.completed) {
            li.classList.add("completed-task");
        }

        let priorityEmoji = task.priority === "High" ? "🔴" : task.priority === "Medium" ? "🟡" : "🟢";
        let dueDateEmoji = task.dueDate ? `📅 ${task.dueDate}` : "📅 No Due Date";

        li.innerHTML = `
            <span class="${task.completed ? "completed" : ""}" onclick="toggleTask(${index})">
                ${task.completed ? "✅ " : ""}${task.text} | ${dueDateEmoji} | ${priorityEmoji} ${task.priority} | 📌 ${task.category}
            </span>
            <div class="task-actions">
                <button onclick="editTask(${index})">✏</button>
                <button onclick="toggleTask(${index})">${task.completed ? "🔄" : "✔"}</button>
                <button onclick="deleteTask(${index})">❌</button>
            </div>
        `;

        taskList.appendChild(li);
    });
}


function deleteTask(index) {
    let tasks = JSON.parse(localStorage.getItem("tasks"));
    tasks.splice(index, 1);
    localStorage.setItem("tasks", JSON.stringify(tasks));
    loadTasks();
}

function clearAllTasks() {
    if (confirm("Are you sure you want to delete all tasks?")) {
        localStorage.removeItem("tasks");
        loadTasks();
    }
}
