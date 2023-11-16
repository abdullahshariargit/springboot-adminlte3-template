package com.hendisantika.entity;

public enum CronJobExpression {
    // Basic Frequency Cron Jobs
    EVERY_SECOND("* * * * *"),
    EVERY_MINUTE("0 * * * *"),
    EVERY_HOUR("0 0 * * *"),
    EVERY_DAY("0 0 0 * *"),
    EVERY_WEEK("0 0 0 * * MON"),
    EVERY_MONTH("0 0 0 1 *"),
    EVERY_YEAR("0 0 0 1 JAN"),

    // Interval-Based Cron Jobs
    EVERY_5_SECONDS("0/5 * * * *"),
    EVERY_10_MINUTES("0 0/10 * * *"),
    EVERY_15_MINUTES("0 */15 * * *"),
    EVERY_30_MINUTES("0 0/30 * * *"),
    EVERY_HOUR_AT_30_MINUTES("0 30 * * *"),
    EVERY_2_HOURS("0 0 */2 * *"),
    EVERY_3_HOURS("0 0 */3 * *"),
    EVERY_6_HOURS("0 0 */6 * *"),
    EVERY_12_HOURS("0 0 */12 * *"),

    // Delayed Cron Jobs
    DELAY_1_MINUTE("1 * * * *"),
    DELAY_5_MINUTES("5 * * * *"),
    DELAY_10_MINUTES("10 * * * *"),
    DELAY_30_MINUTES("30 * * * *"),
    DELAY_1_HOUR("0 1 * * *"),
    DELAY_3_HOURS("0 3 * * *"),

    // Repeating Cron Jobs
    REPEAT_EVERY_5_SECONDS("0-59/5 * * * *"),
    REPEAT_EVERY_10_MINUTES("0-59/10 * * * *"),
    REPEAT_EVERY_15_MINUTES("0-59/15 * * * *"),
    REPEAT_EVERY_30_MINUTES("0-59/30 * * * *"),
    REPEAT_EVERY_HOUR("0-59 * * * *"),
    REPEAT_EVERY_2_HOURS("0-59 */2 * * *"),

    // Conditional Cron Jobs
    WEEKDAYS("0 0 0 * * MON-FRI"),
    WEEKENDS("0 0 0 * * SAT,SUN");
    private final String expression;

    CronJobExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }
}
