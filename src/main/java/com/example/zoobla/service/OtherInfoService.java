package com.example.zoobla.service;

import com.example.zoobla.entity.OtherInfo;
import com.example.zoobla.repository.OtherInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherInfoService {
    @Autowired
    private OtherInfoRepository repository;

    public OtherInfo saveOtherInfo(OtherInfo info)
    {
        return repository.save(info);
    }
    //----------------------------------------------
    public List<OtherInfo> saveOtherInfo(List<OtherInfo> infos)
    {
        return repository.saveAll(infos);
    }
    //-----------------------------------------------
    public List<OtherInfo> getInfos()
    {
        return repository.findAll();
    }
    //-----------------------------------------------
    public OtherInfo getOtherInfoById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    //------------------------------------------------
    //public List<Client> getCustomerByF_name(String f_name)
    // {
    //    return repository.findByF_name(f_name);
    //  }
    //-------------------------------------------------

    public String deleteOtherInfo(int id)
    {
        repository.deleteById(id);
        return "Other Info Removed ||" + id;
    }
    //-------------------------------------------------
    public OtherInfo updateOtherInfo(OtherInfo info)
    {
        OtherInfo existingInfo = repository.findById(info.getOther_id()).orElse(null);
        existingInfo.setAccountant_email(info.getAccountant_email());
        //DO IT FOR ALL THE UPDATED FIELDS
        return repository.save(existingInfo);
    }
    //--------------------------------------------------
}
