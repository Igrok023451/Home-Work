package advance.hw7.one;

public class Utilit {

    public static Worker workerName(Worker[] workers, String name) {
        if (workers == null) {
            System.out.println("Worker[] is null!!!");
            return null;
        } else {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null & name != null) {
                    if (name.equals(workers[i].getName())) {
                        return workers[i];
                    }
                } else {
                    System.out.println("Worker[" + i + "] is null!!! or Name is null!!!");
                    return null;
                }
            }
        }
        return null;
    }

    public static Worker partWorkerName(Worker[] workers, String name) {
        if (workers == null) {
            System.out.println("Worker[] is null!!!");
            return null;
        } else {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null & name != null) {
                    if (workers[i].getName().contains(name)) {
                        return workers[i];
                    }
                } else {
                    System.out.println("Worker[" + i + "] is null!!! or Name is null!!!");
                    return null;
                }
            }
        }
        return null;
    }

    public static double workerSalary(Worker[] workers) {
        double sum = 0;
        if (workers == null) {
            System.out.println("Worker[] is null!!!");
            return sum;
        } else {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null) {
                    sum += workers[i].getSalary();
                } else {
                    System.out.println("Worker[" + i + "] is null!!!");
                    return sum;
                }
            }
        }
        return sum;
    }

    public static double workerMaxSalary(Worker[] workers) {
        double max = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }

    public static double workerMinSalary(Worker[] workers) {
        double min = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();
            }
        }
        return min;
    }

    public static double managerMinEmployee(Manager[] managers) {
        Manager managerMin = null;
        if (managers != null) {
            for (int i = 0; i < managers.length; i++) {
                if (managerMin == null || managerMin.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()) {
                    managerMin = managers[i];
                }
            }
        } else {
            System.out.println("Manager[] is NULL!!!");
            return managerMin.getNumberOfSubordinates();
        }
        return managerMin.getNumberOfSubordinates();
    }

    public static double managerMaxEmployee(Manager[] managers) {
        Manager managerMax = null;
        if (managers != null) {
            for (int i = 0; i < managers.length; i++) {
                if (managerMax == null || managerMax.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                    managerMax = managers[i];
                }
            }
        } else {
            System.out.println("Manager[] is NULL!!!");
            return managerMax.getNumberOfSubordinates();
        }
        return managerMax.getNumberOfSubordinates();
    }

    public static double managerMaxSalary(Manager[] managers) {
        Manager managerMaxSalary = null;
        if (managers != null) {
            for (int i = 0; i < managers.length; i++) {
                if (managerMaxSalary == null || managerMaxSalary.getSalary() < managers[i].getSalary()) {
                    managerMaxSalary = managers[i];
                }
            }
        } else {
            System.out.println("Manager[] is NULL!!!");
            return managerMaxSalary.getSalary();
        }
        return managerMaxSalary.getSalary() - managerMaxSalary.getBaseSalary();
    }

    public static double managerMinSalary(Manager[] managers) {
        Manager managerMinSalary = null;
        if (managers != null) {
            for (int i = 0; i < managers.length; i++) {
                if (managerMinSalary == null || managerMinSalary.getSalary() > managers[i].getSalary()) {
                    managerMinSalary = managers[i];
                }
            }
        } else {
            System.out.println("Manager[] is NULL!!!");
            return managerMinSalary.getSalary();
        }
        return managerMinSalary.getSalary() ;
    }
}