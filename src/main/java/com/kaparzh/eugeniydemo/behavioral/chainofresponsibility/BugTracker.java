package com.kaparzh.eugeniydemo.behavioral.chainofresponsibility;

public class BugTracker {

    public static void main(String[] args) {
        Notifier simpleReportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        simpleReportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        simpleReportNotifier.notifyManage("Everything is OK", Priority.ROUTINE);
        simpleReportNotifier.notifyManage("Something went wrong", Priority.IMPORTANT);
        simpleReportNotifier.notifyManage("Houston, we've had a problem!!!", Priority.ASAP);
    }
}
