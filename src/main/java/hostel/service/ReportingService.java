package main.java.hostel.service;

import main.java.hostel.domain.Exportable;

import java.util.List;

public class ReportingService {

    public String generateCsv(List<? extends Exportable> items) {
        StringBuilder sb = new StringBuilder();
        for (Exportable e : items) {
            sb.append(e.toCsv()).append("\n");
        }
        return sb.toString();
    }
}
