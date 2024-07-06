package org.newapp.newapp.model;

public enum Position {
    Manager , SuperVisor , TeamLeader , Member;

    @Override
    public String toString() {
        switch (this){
            case Member -> {
                return "Member";
            }
            case Manager -> {
                return "Manager";
            }
            case SuperVisor -> {
                return "SuperVisor";
            }
            case TeamLeader -> {
                return "TeamLeader";
            }

        }
        return "Not Valid";
    }
}
