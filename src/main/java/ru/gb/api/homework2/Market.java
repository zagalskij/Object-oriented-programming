package ru.gb.api.homework2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour{
    List <Actor> orders = new ArrayList<>();

    Queue<Actor> que = new LinkedList<>();
    @Override
    public void takeInQueue(Actor actor) {
        que.add(actor);

    }

    @Override
    public void takeOrders() {
      que.peek().setMakeOrder();

    }

    @Override
    public void giveOrders() {
        que.peek().setTakeOrder();

    }

    @Override
    public void releaseFromQueue() {
        que.remove();

    }

    @Override
    public String toString() {
        if (!orders.isEmpty()){
                return orders.toString();
            } else
    return "There are no customers in the store";
    }

    @Override
    public void acceptToMarket(Actor actor) {
        orders.add(actor);

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        orders.removeAll(actors);
    }

    @Override
    public void update() {
        if (!orders.isEmpty()){

        if (!que.isEmpty()) {
            // Принимаем заказ
            takeOrders();

            // Выдаем заказ
            giveOrders();

            // Удаляем актера из очереди
            releaseFromQueue();
        }

    }
    else {
        System.out.println("There are no customers in the store");
    }}
}
