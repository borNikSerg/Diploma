package com.print86.diploma.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Report {
    public Report(Date dateFrom, Date dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.requests = new ArrayList<>();
    }

    private Date dateFrom;
    private Date dateTo;

    public String getDate() {
        return dateTo.toString() + "-" + dateFrom.toString();
    }

    public void add(Request request) {
        requests.add(request);
    }
    private List<Request> requests;

    public List<Request> getRequests() {
        return List.copyOf(requests);
    }
}
