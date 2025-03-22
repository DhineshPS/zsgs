const searchInput = document.getElementById("searchInput");
const recipesContainer = document.getElementById("recipesContainer");
const categorySelect = document.getElementById("categorySelect");
const areaSelect = document.getElementById("areaSelect");
const recipeDetails = document.getElementById("recipeDetails");
const recipeContent = document.getElementById("recipeContent");
const closeBtn = document.getElementById("closeBtn");

searchInput.addEventListener("input", fetchRecipes);
categorySelect.addEventListener("change", fetchRecipes);
areaSelect.addEventListener("change", fetchRecipes);
closeBtn.addEventListener("click", () => recipeDetails.classList.add("hidden"));

async function fetchCategoriesAndAreas() {
    const categoriesRes = await fetch("https://www.themealdb.com/api/json/v1/1/list.php?c=list");
    const categoriesData = await categoriesRes.json();
    categorySelect.innerHTML = `<option value="">All Categories</option>`;
    categoriesData.meals.forEach(category => {
        categorySelect.innerHTML += `<option value="${category.strCategory}">${category.strCategory}</option>`;
    });

    const areasRes = await fetch("https://www.themealdb.com/api/json/v1/1/list.php?a=list");
    const areasData = await areasRes.json();
    areaSelect.innerHTML = `<option value="">All Areas</option>`;
    areasData.meals.forEach(area => {
        areaSelect.innerHTML += `<option value="${area.strArea}">${area.strArea}</option>`;
    });
}

async function fetchRecipes() {
    const query = searchInput.value.trim();
    const category = categorySelect.value;
    const area = areaSelect.value;

    let url = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + query;
    if (!query && category) url = `https://www.themealdb.com/api/json/v1/1/filter.php?c=${category}`;
    if (!query && area) url = `https://www.themealdb.com/api/json/v1/1/filter.php?a=${area}`;

    const res = await fetch(url);
    const data = await res.json();
    displayRecipes(data.meals || []);
}

function displayRecipes(recipes) {
    recipesContainer.innerHTML = "";
    recipes.forEach(recipe => {
        const recipeCard = document.createElement("div");
        recipeCard.classList.add("recipe-card");
        recipeCard.innerHTML = `
            <img src="${recipe.strMealThumb}" alt="${recipe.strMeal}">
            <h3>${recipe.strMeal}</h3>
            <button onclick="viewRecipe(${recipe.idMeal})">View Recipe</button>
        `;
        recipesContainer.appendChild(recipeCard);
    });
}

async function viewRecipe(recipeId) {
    const res = await fetch(`https://www.themealdb.com/api/json/v1/1/lookup.php?i=${recipeId}`);
    const data = await res.json();
    const recipe = data.meals[0];

    let ingredients = "";
    for (let i = 1; i <= 20; i++) {
        if (recipe[`strIngredient${i}`]) {
            ingredients += `<li>${recipe[`strIngredient${i}`]} - ${recipe[`strMeasure${i}`]}</li>`;
        }
    }

    recipeContent.innerHTML = `
        <h2>${recipe.strMeal}</h2>
        <img src="${recipe.strMealThumb}" width="200">
        <h3>Ingredients:</h3>
        <ul>${ingredients}</ul>
        <h3>Instructions:</h3>
        <p>${recipe.strInstructions}</p>
        <a href="${recipe.strYoutube}" target="_blank">Watch Tutorial</a>
    `;

    recipeDetails.classList.remove("hidden");
}

fetchCategoriesAndAreas();
fetchRecipes();
