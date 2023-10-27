package ru.gb.api.homework7;

import ru.gb.api.homework7.Data.*;

import java.util.logging.Logger;

public class Presenter {
    View view;
    SumModel sumModel;
    SubstractionModel substractionModel;
    DivisionModel divisionModel;
    MultiplicationModel multiplicationModel;


    public Presenter(View view, SumModel sumModel, SubstractionModel substractionModel, DivisionModel divisionModel, MultiplicationModel multiplicationModel) {
        this.view = view;
        this.sumModel = sumModel;
        this.substractionModel = substractionModel;
        this.divisionModel = divisionModel;
        this.multiplicationModel = multiplicationModel;
    }

    public void buttonClick(){
        boolean f = true;
        while (f) {
            int no = view.getValue("""
                    Select a task: 
                    1 - Sum
                    2 - Subtraction 
                    3 - Division
                    4 - Multiplication
                    9 - Last operation result
                    0 - Завершение работы приложения
                    """);

        switch (no) {
            case 1: {
                double a = view.getValue("enter the first number: ");
                double b = view.getValue("enter the second number: ");
                sumModel.setX(a);
                sumModel.setY(b);
                double result = sumModel.result();;
                view.print(result, "Sum: ");
                Config.logger.info("Performed addition. Result: " + result);
                HistoryModel.historyStack.push(result);
                break;
            }
                case 2: {
                    double a = view.getValue("enter the first number: ");
                    double b = view.getValue("enter the second number: ");
                    substractionModel.setX(a);
                    substractionModel.setY(b);
                    double result = substractionModel.result();;
                    view.print(result, "Sum: ");
                    Config.logger.info("Performed addition. Result: " + result);
                    HistoryModel.historyStack.push(result);
                    break;
                }
                case 3: {
                    double a = view.getValue("enter the first number: ");
                    double b = view.getValue("enter the second number: ");
                    divisionModel.setX(a);
                    divisionModel.setY(b);
                    double result = divisionModel.result();;
                    view.print(result, "Sum: ");
                    Config.logger.info("Performed addition. Result: " + result);
                    HistoryModel.historyStack.push(result);
                    break;
                }
                case 4: {
                    double a = view.getValue("enter the first number: ");
                    double b = view.getValue("enter the second number: ");
                    multiplicationModel.setX(a);
                    multiplicationModel.setY(b);
                    double result = multiplicationModel.result();;
                    view.print(result, "Sum: ");
                    Config.logger.info("Performed addition. Result: " + result);
                    HistoryModel.historyStack.push(result);
                    break;
                }
                case 0:
                    System.out.println("Shutting down the application");
                    f = false;
                    break;
                case 9:
                    if (!HistoryModel.historyStack.isEmpty()) {
                        Double lastResult = HistoryModel.historyStack.pop();
                        System.out.println("Last operation result was: " + lastResult);
                    } else {
                        System.out.println("No previous operation to undo.");
                    }
                    break;
                default:
                    System.out.println("Invalid task number,\n try entering again");
                    break;
            }
        }
    }

        }
