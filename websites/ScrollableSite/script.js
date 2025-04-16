document.getElementById("addQuestion").addEventListener("click", function () {
    let questionInput = document.getElementById("questionInput").value;
    let answerInput = document.getElementById("answerInput").value;

    if (questionInput.trim() === "" || answerInput.trim() === "") {
        alert("Please enter both a question and an answer.");
        return;
    }

    let questionContainer = document.getElementById("questionsContainer");
    let tocList = document.getElementById("tocList");

    let section = document.createElement("section");
    section.classList.add("question");
    section.id = "q" + (tocList.children.length + 1);
    
    let questionTitle = document.createElement("h3");
    questionTitle.innerText = (tocList.children.length + 1) + ". " + questionInput;

    let answerText = document.createElement("p");
    answerText.innerText = answerInput;

    section.appendChild(questionTitle);
    section.appendChild(answerText);
    questionContainer.appendChild(section);

    let listItem = document.createElement("li");
    let link = document.createElement("a");
    link.href = "#" + section.id;
    link.innerText = questionTitle.innerText;

    listItem.appendChild(link);
    tocList.appendChild(listItem);

    document.getElementById("questionInput").value = "";
    document.getElementById("answerInput").value = "";
});

document.getElementById("tocList").addEventListener("click", function (e) {
    if (e.target.tagName === "A") {
        e.preventDefault();
        document.querySelector(e.target.getAttribute("href")).scrollIntoView({behavior: "smooth"});
    }
});

document.getElementById("backToTop").addEventListener("click", function() {
    window.scrollTo({ top: 0, behavior: "smooth" });
});
