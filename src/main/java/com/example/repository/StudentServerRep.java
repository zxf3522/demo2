package com.example.repository;

import com.example.domain.StudentServer;
import org.omg.PortableServer.POAManagerPackage.State;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/2/9 0009.
 */
public interface StudentServerRep extends JpaRepository<StudentServer,Integer>{
}
