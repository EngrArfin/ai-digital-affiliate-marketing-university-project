//st-1 add even handelar
//st-2 get the withdrow amount from withdrow amount 
//stp-3 input string convert to number use parseFloat
//stp-4
//stp-5
document.getElementById('btn-withdraw').addEventListener('click', function(){
    //stp-2
    const withdrawField = document.getElementById('withdraw-field');
    const newWithDrawAmountString = withdrawField.value;
    const newWithdrawAmount =parseFloat(newWithDrawAmountString);
    //stp-3
    const withdrawTotalElement = document.getElementById('withdrow-total');
    const previousWithdrawTotalString = withdrawTotalElement.innerText;
    const previousWithdrawTotal = parseFloat(previousWithdrawTotalString);
    //stp-4
    const currentWithdrawTotal = previousWithdrawTotal + newWithdrawAmount;
    withdrawTotalElement.innerText = currentWithdrawTotal;
    //stp-5
    const balanceTotalElement = document.getElementById('balance-total');
    const previousBalanceTotalString = balanceTotalElement.innerText;
    const previousBalanceTotal = parseFloat(previousBalanceTotalString);
    console.log(previousBalanceTotal)
    //stp-6
    const newBalanceTotal = previousBalanceTotal - newWithdrawAmount;
    balanceTotalElement.innerText = newBalanceTotal;

    //stp-7
    withdrawField.value ='';
})