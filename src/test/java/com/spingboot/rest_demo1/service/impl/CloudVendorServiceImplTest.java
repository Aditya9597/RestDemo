//package com.spingboot.rest_demo1.service.impl;
//
//
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.doAnswer;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.*;
//
//import org.h2.command.dml.MergeUsing.When;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Answers;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//
//import com.spingboot.rest_demo1.model.CloudVendor;
//import com.spingboot.rest_demo1.repository.CloudVendorRepositary;
//import com.spingboot.rest_demo1.service.CloudVendorService;
//
//
//public class CloudVendorServiceImplTest {
//	
//	@Mock
//	private CloudVendorRepositary cloudVendorRepository;
//	private CloudVendorService cloudVendorService;
//	AutoCloseable autoCloseable;
//	CloudVendor cloudVendor;
//	
//	
//	@BeforeEach
//	void setUp() {
//		autoCloseable= MockitoAnnotations.openMocks( this);
//		cloudVendorService= new CloudVendorServiceImpl(cloudVendorRepository);
//		cloudVendor =new CloudVendor("2", "FaceBook", "USA", 2006);
//		
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//		autoCloseable.close(); 
//	}
//		
//		
//	@Test
//	void testCreateCloudVendor() {
//		mock(CloudVendor.class);
//		mock(CloudVendorRepositary.class);
//		
//		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
//		assertThat(cloudVendorService.createCloudVendor(cloudVendor)).isEqualTo("Successfully Created");
//		
//		
//	}
//	
//	@Test
//	void testUpdateCloudVendor() {
//		
//		mock(CloudVendor.class);
//		mock(CloudVendorRepositary.class);
//		
//		when(cloudVendorRepository.save(cloudVendor)).thenReturn(cloudVendor);
//		assertThat(cloudVendorService.updateCloudVendor(cloudVendor)).isEqualTo("Successfully Updated");
//		
//	}
//		
//
//	@Test
//	void testGetCloudVendor() {
//		
//		mock(CloudVendor.class);
//		mock(CloudVendorRepositary.class);
//		
//		when(cloudVendorRepository.findById("1")).thenReturn(Optional.ofNullable(cloudVendor));
//		assertThat(cloudVendorService.getCLoudVendor("1").getVendorName()).isEqualTo(cloudVendor.getVendorName());
//	}
//
//
//	@Test
//	void testGetByVendorName() {
//		
//		mock(CloudVendor.class);
//		mock(CloudVendorRepositary.class);
//		
//		when(cloudVendorRepository.findByVendorName("Facebook")).thenReturn(
//				new ArrayList<CloudVendor>(Collections.singleton(cloudVendor)));
//		
//		//assertThat(cloudVendorService.getVendorByName("Facebook").get(0).getVendorId())
//				  //.isEqualTo(cloudVendor.getVendorId());
//		
//		
//	}
//	
//	@Test
//	void testGetAllVendors() {
//
//		mock(CloudVendor.class);
//		mock(CloudVendorRepositary.class);
//		
//		when(cloudVendorRepository.findAll()).thenReturn(
//				new ArrayList<CloudVendor>(Collections.singleton(cloudVendor)));
//		
//		assertThat(cloudVendorService.getAllCloudVendors().get(0).getVendorPhoneNumber())
//		  .isEqualTo(cloudVendor.getVendorPhoneNumber());
//
//	}
////
////	@Test
////	void tesDeleteCloudVendor() {
////
////		mock(CloudVendor.class);
////		mock(CloudVendorRepositary.class, Mockito.CALLS_REAL_METHODS);
////		
////		doAnswer(Answers.CALLS_REAL_METHODS).when(cloudVendorRepository.deleteById(any()));
////
////		assertThat(cloudVendorService.deleteCloudVendor("1")).isEqualTo("Successfully deleted");
////		
////		
////	}
//	
//}
