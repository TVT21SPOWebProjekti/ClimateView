package com.climateview.server.northservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.climateview.server.data.AnnualData;
import com.climateview.server.data.MonthlyData;
import com.climateview.server.repository.AnnualDataRepo;

@Service
public class AnnualDataService {
    public List<AnnualData> Annual = new ArrayList<>();

    @Autowired
    AnnualDataRepo pAnnual;

    public List<AnnualData> getAllAnnualDatas(){
        return pAnnual.findAll();
    }

    public Optional<AnnualData> getAnnualById(Long id){

        return pAnnual.findById(id);
    }

    public List<AnnualData> getAnnualByClassId(String class_Id){
        List<AnnualData> search = new ArrayList<>();
        
        for (AnnualData annualData : Annual) {
            if(annualData.getClassId() == (class_Id)){
                search.add(annualData);
            }
            
        }
        return search;
    }
}