package com.isabel.mvpcalculator.presenters;

import com.isabel.mvpcalculator.interactor.OperationInteractorlmpl;
import com.isabel.mvpcalculator.interfaces.OperationInteractor;
import com.isabel.mvpcalculator.interfaces.OperationPresenter;
import com.isabel.mvpcalculator.interfaces.OperationView;

public class OperationPresenterlmpl implements OperationPresenter {

    private OperationView view;
    private OperationInteractor interactor;

    public OperationPresenterlmpl(OperationView view){
        this.view = view;
        this.interactor = new OperationInteractorlmpl(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void invalidOperation() {
        if (view != null){
            view.invalidOperation();
        }
    }

    @Override
    public void add(int num1, int num2) {
        if (interactor != null){
            interactor.add(num1, num2);
        }
    }

    @Override
    public void subtract(int num1, int num2) {
        if (interactor != null) {
            interactor.subtract(num1, num2);
        }
    }

    @Override
    public void multiply(int num1, int num2) {
        if (interactor != null) {
            interactor.multiply(num1, num2);
        }

    }

    @Override
    public void divide(int num1, int num2) {
        if (interactor != null) {
            interactor.divide(num1, num2);
        }
    }
}
