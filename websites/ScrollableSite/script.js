document.getElementById("addQuestion").addEventListener("click", function () {
    const questionInput = document.getElementById("questionInput").value;
    const answerInput = document.getElementById("answerInput").value;

    if (questionInput.trim() === "" || answerInput.trim() === "") {
        alert("Please enter both a question and an answer.");
        return;
    }

    const questionContainer = document.getElementById("questionsContainer");
    const tocList = document.getElementById("tocList");

    const section = document.createElement("section");
    section.classList.add("question");
    section.id = "q" + (tocList.children.length + 1);
    
    const questionTitle = document.createElement("h3");
    questionTitle.innerText = (tocList.children.length + 1) + ". " + questionInput;

    const answerText = document.createElement("p");
    answerText.innerText = answerInput;

    section.appendChild(questionTitle);
    section.appendChild(answerText);
    questionContainer.appendChild(section);

    const listItem = document.createElement("li");
    const link = document.createElement("a");
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
        document.querySelector(e.target.getAttribute("href")).scrollIntoView({
            behavior: "smooth"
        });
    }
});

document.getElementById("backToTop").addEventListener("click", function() {
    window.scrollTo({ top: 0, behavior: "smooth" });
});
