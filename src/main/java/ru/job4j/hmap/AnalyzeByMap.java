package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                sum += s.score();
                count++;
            }
        }
        return sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        double sum = 0;
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                sum += s.score();
            }
            labels.add(new Label(p.name(), sum / p.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> rsl = new ArrayList<>();
        Map<String, Integer> lhm = new LinkedHashMap<>();
        for (Pupil stud : pupils) {
            for (Subject name : stud.subjects()) {
                lhm.put(name.name(), lhm.getOrDefault(name.name(), 0) + name.score());
            }
        }
        for (String key : lhm.keySet()) {
            rsl.add(new Label(key, (double) lhm.get(key) / pupils.size()));
        }
        return rsl;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> students = averageScoreByPupil(pupils);
        students.sort(Comparator.naturalOrder());
        return students.get(students.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> subjects = averageScoreBySubject(pupils);
        subjects.sort(Comparator.naturalOrder());
        return subjects.get(subjects.size() - 1);
    }
}