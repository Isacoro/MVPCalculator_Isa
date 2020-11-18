package com.isabel.mvpcalculator.interactor;

import com.isabel.mvpcalculator.interfaces.OperationInteractor;
import com.isabel.mvpcalculator.interfaces.OperationPresenter;

public class OperationInteractorlmpl implements OperationInteractor {

    private int result;
    private OperationPresenter presenter;

    public OperationInteractorlmpl (OperationPresenter operationPresenter){
        this.presenter = operationPresenter;
    }

    @Override
    public void add(int num1, int num2) {
        result = num1 + num2;
        presenter.showResult(Integer.toString(result));

    }

    @Override
    public void subtract(int num1, int num2) {
        result = num1 - num2;
        presenter.showResult(Integer.toString(result));

    }

    @Override
    public void multiply(int num1, int num2) {
        result = num1 * num2;
        presenter.showResult(Integer.toString(result));

    }

    @Override
    public void divide(int num1, int num2) {
        if(num2 == 0){
            result = num1 / num2;
            presenter.showResult(Integer.toString(result));
        }else{
            presenter.invalidOperation();
        }

    }
}
