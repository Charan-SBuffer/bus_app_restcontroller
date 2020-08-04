package com.practise.servise;

import java.util.List;

import com.practise.model.VW_BUS_COMPLETE_DATA;

public interface VwbuserviceInt {

 public List<VW_BUS_COMPLETE_DATA> getallbuses();
 public VW_BUS_COMPLETE_DATA getonID(String id);
 public List<VW_BUS_COMPLETE_DATA> getallbusesoftypes(String bustype);
 public void deletvwofid(String id);
}
