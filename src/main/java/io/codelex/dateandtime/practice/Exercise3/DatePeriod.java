package io.codelex.dateandtime.practice.Exercise3;

import java.time.LocalDate;

public class DatePeriod {

    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Overlap start date: " + start.getDayOfMonth() + "." + start.getMonthValue() + "." + start.getYear()
                + "\nEnd date: " + end.getDayOfMonth() + "." + end.getMonthValue() + "." + end.getYear();
    }

    public DatePeriod intersection(DatePeriod period) {
        if (isNotOverLapping(period)) {
            return null;
        } else if (includes(period)) {
            return new DatePeriod(this.start, this.end);
        } else if (this.start.isEqual(period.getEnd())) {
            return new DatePeriod(this.start, period.getEnd());
        } else if (this.end.isEqual(period.getStart())) {
            return new DatePeriod(this.end, period.getStart());
        } else {
            LocalDate overlapStart = null;
            LocalDate overlapEnd = null;
            if (period.getStart().isBefore(this.end)) {
                overlapStart = period.getStart();
                overlapEnd = this.end;
            } else if (period.getEnd().isAfter(this.start)) {
                overlapStart = this.start;
                overlapEnd = period.getEnd();
            }
            period = new DatePeriod(overlapStart, overlapEnd);
        }
        return period;
    }

    public boolean isNotOverLapping(DatePeriod period) {
        return period.getEnd().isBefore(this.start) || this.end.isBefore(period.getStart());
    }

    public boolean includes(DatePeriod period) {
        return this.start.isAfter(period.getStart()) && this.end.isBefore(period.getEnd());
    }
}
