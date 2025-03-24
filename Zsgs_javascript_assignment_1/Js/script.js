let expenses = [];

function addExpense() {
    let descript = document.getElementById('description').value;
    let amt = parseFloat(document.getElementById('amount').value);
    if(descript && !isNaN(amt)) {
        expenses.push({descript, amt});
        renderExpense();
        document.getElementById('description').value = '';
        document.getElementById('amount').value = '';
    }
}

function renderExpense() {
    let list = document.getElementById('expense');
    list.innerHTML = '';
    let total = 0;
    expenses.forEach((expense, index) => {
        total += expense.amt;

        let tr = document.createElement('tr');

        let tdDescript = document.createElement('td');
        tdDescript.contentEditable = "true";
        tdDescript.textContent = expense.descript;
        tdDescript.onblur = function() {
            editExpense(index, 'descript', this.textContent);
        };
        tr.appendChild(tdDescript);

        let tdAmt = document.createElement('td');
        tdAmt.contentEditable = "true";
        tdAmt.textContent = `Rs.${expense.amt.toFixed(2)}`;
        tdAmt.onblur = function() {
            editExpense(index, 'amt', this.textContent);
        };
        tr.appendChild(tdAmt);

        let tdDelete = document.createElement('td');
        let deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.onclick = function() {
            deleteExpense(index);
        };
        tdDelete.appendChild(deleteButton);
        tr.appendChild(tdDelete);

        list.appendChild(tr);
    });
    document.getElementById('total').textContent = `Total: Rs.${total.toFixed(2)}`;
}

function editExpense(index, field, value) {
    if(field === 'amt') {
        value = parseFloat(value.replace('Rs.', ''));
        if(isNaN(value)) return;
    }
    expenses[index][field] = value;
    renderExpense();
}

function deleteExpense(index) {
    expenses.splice(index, 1);
    renderExpense();
}