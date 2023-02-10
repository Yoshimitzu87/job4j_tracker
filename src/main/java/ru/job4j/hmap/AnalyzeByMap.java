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
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int count = 0;
            double score = 0D;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
            list.add(new Label(pupil.name(), score / count));
        }
        return list;
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
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0D;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(pupils.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int rslSum = map.getOrDefault(subject.name(), 0) + subject.score();
                map.put(subject.name(), rslSum);
            }
        }
        for (String name : map.keySet()) {
            list.add(new Label(name, map.get(name)));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}