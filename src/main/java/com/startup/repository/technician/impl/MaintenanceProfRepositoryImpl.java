//package com.startup.repository.technician.impl;
//
//import com.startup.entity.technician.MaintenanceProf;
//import com.startup.repository.technician.MaintenanceProfRepository;
//
//
//import java.util.*;
//
//public class MaintenanceProfRepositoryImpl implements MaintenanceProfRepository {
//
//    private static MaintenanceProfRepositoryImpl repository = null;
//    private Set<MaintenanceProf> maintenanceProfs;
//
//    private MaintenanceProfRepositoryImpl(){
//        this.maintenanceProfs = new HashSet<>();
//    }
//
//    public static MaintenanceProfRepositoryImpl getRepository(){
//        if (repository == null) repository = new MaintenanceProfRepositoryImpl();
//        return repository;
//    }
//    @Override
//    public Set<MaintenanceProf>getAll() {
//        return maintenanceProfs;
//    }
//
//    @Override
//    public MaintenanceProf create(MaintenanceProf maintenanceProf) {
//        if (read(maintenanceProf.getMaintenanceId()) == null){
//           maintenanceProfs.add(maintenanceProf);
//        }
//        return maintenanceProf;
//    }
//
//    @Override
//    public MaintenanceProf update(MaintenanceProf maintenanceProf) {
//        if (read(maintenanceProf.getMaintenanceId()) == null){
//            delete(maintenanceProf.getMaintenanceId());
//            create(maintenanceProf);
//        }
//        return maintenanceProf;
//    }
//
//    @Override
//
//    public boolean delete(String s) {
//        MaintenanceProf maintenanceProf = read(s);
//        if(maintenanceProf != null){
//            this.maintenanceProfs.remove(maintenanceProf);
//            return true;
//        }
//        return false;
//
//    }
//
//    @Override
//    public MaintenanceProf read(String s) {
//        for (MaintenanceProf maintenanceProf : maintenanceProfs) {
//            if (s.equalsIgnoreCase(maintenanceProf.getMaintenanceId())) {
//                return maintenanceProf;
//            }
//        }
//        return null;
//    }
//}
