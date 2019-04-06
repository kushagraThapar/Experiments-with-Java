package com.dhawal;

public class FinalDesignClass {

    private final String message;
    private final String topic;

    private static FinalDesignClass instance;

    private FinalDesignClass(String message, String topic) {
        this.message = message;
        this.topic = topic;
    }

    public synchronized static FinalDesignClass getFinalDesign(String message, String topic) {
        if (instance == null) {
            instance = new FinalDesignClass(message, topic);
        }
        return instance;
    }
}
