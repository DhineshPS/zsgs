let tasks = JSON.parse(localStorage.getItem("tasks")) || []; // Load tasks from local storage or initialize an empty array

// Function to show the main page
function showMainPage() {
    document.querySelector(".main-page").style.display = "block"; // Show the main page
    document.querySelector(".task-table").style.display = "none"; // Hide the task table
}

// Function to add a task
function addTask() {
    const taskName = document.getElementById("task").value;
    const dueDate = document.getElementById("dueDate").value;
    const category = document.getElementById("category").value;
    const priority = document.querySelector('input[name="priority"]:checked')?.value;

    if (!taskName || !dueDate || !category || !priority) {
        alert("Please fill in all fields!");
        return;
    }

    // Add task to the array
    tasks.push({
        taskName,
        dueDate,
        category,
        priority,
        completed: false,
    });

    // Save tasks to local storage
    localStorage.setItem("tasks", JSON.stringify(tasks));

    alert("Task added successfully!");

    // Clear the fields
    const form = document.querySelector("form");
    if (form) {
        form.reset(); // Reset the form fields
    }
}

// Function to filter tasks by priority
function filterByPriority(priority) {
    const filteredTasks = tasks.filter(task => task.priority === priority);
    showTasks(filteredTasks, `Tasks with Priority: ${priority}`);
}

// Function to filter tasks by category
function filterByCategory(category) {
    const filteredTasks = tasks.filter(task => task.category === category);
    showTasks(filteredTasks, `Tasks in Category: ${category}`);
}

// Function to filter tasks due today
function filterByDueDate() {
    const today = new Date().toISOString().split("T")[0];
    const dueToday = tasks.filter(task => task.dueDate === today);
    showTasks(dueToday, "Tasks Due Today");
}

// Function to show all tasks
function showAllTasks() {
    showTasks(tasks, "All Tasks");
}

// Function to clear all tasks
function clearAllTasks() {
    if (confirm("Are you sure you want to clear all tasks?")) {
        tasks = [];
        localStorage.setItem("tasks", JSON.stringify(tasks)); // Clear tasks in local storage
        alert("All tasks cleared!");
    }
}

// Function to mark tasks as completed
function completedTasks() {
    const completed = tasks.filter(task => task.completed);
    showTasks(completed, "Completed Tasks");
}

// Function to filter pending tasks
function pendingTasks() {
    const pending = tasks.filter(task => !task.completed);
    showTasks(pending, "Pending Tasks");
}

// Function to display tasks in a table
function showTasks(taskList, title) {
    const taskTableDiv = document.querySelector(".task-table");
    const tableBody = taskTableDiv.querySelector("tbody");
    const tableTitle = taskTableDiv.querySelector("h2");

    // Clear the table body
    tableBody.innerHTML = "";

    // Set the title
    tableTitle.textContent = title;

    // Populate the table with tasks
    taskList.forEach(task => {
        const row = document.createElement("tr");

        ["taskName", "dueDate", "category", "priority"].forEach(key => {
            const td = document.createElement("td");
            td.textContent = task[key];
            row.appendChild(td);
        });

        // Add status column
        const statusTd = document.createElement("td");
        statusTd.textContent = task.completed ? "Completed" : "Pending";
        row.appendChild(statusTd);

        tableBody.appendChild(row);
    });

    // Show the task table and hide the main page
    document.querySelector(".main-page").style.display = "none";
    taskTableDiv.style.display = "block";
}

// Function to render the main page
function renderMainPage() {
    const container = document.querySelector(".container-wrapper");
    container.innerHTML = `
        <div class="lcontainer main-page">
            <h1>To-Do!</h1>
            <label for="task">Task:</label>
            <input type="text" id="task" name="task" placeholder="Enter your task" required>
            <br><br>

            <label for="dueDate">Due Date:</label>
            <input type="date" id="dueDate" name="dueDate" required>
            <br><br>

            <label for="category">Category:</label>
            <select id="category" name="category" required>
                <option value="" disabled selected>Select a category</option>
                <option value="Work">Work</option>
                <option value="Personal">Personal</option>
            </select>
            <br><br>

            <fieldset class="priority">
                <legend>Priority:</legend>
                <div class="priority-item">
                    <label for="urgent">Urgent</label>
                    <input type="radio" id="urgent" name="priority" value="Urgent" required>
                </div>
                <div class="priority-item">
                    <label for="important">Important</label>
                    <input type="radio" id="important" name="priority" value="Important">
                </div>
                <div class="priority-item">
                    <label for="not-urgent">Not Urgent</label>
                    <input type="radio" id="not-urgent" name="priority" value="Not Urgent">
                </div>
                <div class="priority-item">
                    <label for="not-important">Not Important</label>
                    <input type="radio" id="not-important" name="priority" value="Not Important">
                </div>
            </fieldset>
            <br>

            <button type="submit" onclick="addTask()">Add Task</button>
            <button type="reset">Reset</button>
        </div>

        <div class="rcontainer">
            <h2>Filter Tasks</h2>
            <div class="box">
                <button onclick="filterByPriority('Urgent')">Show Urgent Tasks</button>
                <button onclick="filterByPriority('Important')">Show Important Tasks</button>
                <button onclick="filterByPriority('Not Urgent')">Show Not Urgent Tasks</button>
                <button onclick="filterByPriority('Not Important')">Show Not Important Tasks</button>
            </div>
            <br><br>
            <div class="box">
                <button onclick="filterByDueDate()">Show Tasks by Due Date</button>
                <button onclick="filterByCategory('Work')">Show Work Tasks</button>
                <button onclick="filterByCategory('Personal')">Show Personal Tasks</button>
            </div>
            <br><br>
            <div class="box">
                <button onclick="showAllTasks()">Show All Tasks</button>
                <button onclick="clearAllTasks()">Clear All Tasks</button>
                <button onclick="completedTasks()">Completed Tasks</button>
                <button onclick="pendingTasks()">Pending Tasks</button>
            </div>
        </div>
    `;
}

// Function to initialize the app
function initializeApp() {
    // Load tasks from local storage
    tasks = JSON.parse(localStorage.getItem("tasks")) || [];

    // Show the main page on load
    showMainPage();
}

// Initialize the app on page load
document.addEventListener("DOMContentLoaded", initializeApp);