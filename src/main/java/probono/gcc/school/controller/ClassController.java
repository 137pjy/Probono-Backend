package probono.gcc.school.controller;

import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import probono.gcc.school.model.dto.classes.AssignClassResponseDTO;
import probono.gcc.school.model.dto.classes.ClassResponse;
import probono.gcc.school.model.dto.classes.CreateClassRequest;
import probono.gcc.school.model.dto.NoticeResponse;
import probono.gcc.school.model.dto.users.TeacherResponseDTO;
import probono.gcc.school.model.entity.Classes;
import probono.gcc.school.service.ClassService;
import probono.gcc.school.service.TeacherService;

@RestController
@RequiredArgsConstructor
public class ClassController {

  private final ClassService classService;
  private final TeacherService teacherService;

  @PostMapping("/class")
  @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
  public ResponseEntity<ClassResponse> createStudent(
      @RequestBody @Valid CreateClassRequest request) {
    Classes classes = new Classes();
    classes.setGrade(request.getGrade());
    classes.setSection(request.getSection());
    classes.setYear(request.getYear());
    classes.setCreatedChargeId(-1L);

    ClassResponse createdClass = classService.create(classes);
    return ResponseEntity.ok(createdClass);
  }

  @GetMapping("/class/{id}")
  @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
  public ResponseEntity<ClassResponse> getClass(@PathVariable Long id) {
    ClassResponse classResponse = classService.getClass(id);
    return ResponseEntity.ok(classResponse);
  }

  @GetMapping("/classList")
  @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
  public ResponseEntity<Page<ClassResponse>> getClassList(
      @RequestParam(value = "page", defaultValue = "0") int page,
      @RequestParam(value = "size", defaultValue = "10") int size,
      @RequestParam(value = "year", defaultValue = "#{T(java.time.Year).now().getValue()}") int year) {
    Page<ClassResponse> classList = classService.getClassList(page, size, year);
    return ResponseEntity.ok(classList);
  }

  @PutMapping("/class/{id}")
  @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
  public ResponseEntity<ClassResponse> updateClass(@PathVariable Long id,
      @RequestBody @Valid CreateClassRequest request) {
    ClassResponse updatedClass = classService.updateClass(id, request);
    return ResponseEntity.ok(updatedClass);
  }

  @DeleteMapping("/class/{id}")
  @PreAuthorize("hasAnyRole('TEACHER','ADMIN')")
  public ResponseEntity<Void> deleteClass(@PathVariable Long id) {
    classService.deleteClass(id);
    return ResponseEntity.noContent().build();
  }

  //  @GetMapping("/classNoticeList/{id}")
//  @PreAuthorize("hasAnyRole('TEACHER','ADMIN','STUDENT')")
//  public ResponseEntity<List<NoticeResponse>> getClassNoticeList(@PathVariable Long id) {
//    List<NoticeResponse> noticeList = classService.getClassNoticeList(id);
//    return ResponseEntity.ok(noticeList);
//  }
//  @GetMapping("/classNoticeList/{id}")
//  @PreAuthorize("hasAnyRole('TEACHER','ADMIN','STUDENT')")
//  public ResponseEntity<Page<NoticeResponse>> getClassNoticeList(@PathVariable Long id,
//      @RequestParam(value = "page", defaultValue = "0") int page,
//      @RequestParam(value = "size", defaultValue = "10") int size) {
//    Page<NoticeResponse> noticeList = classService.getClassNoticeList(id, page, size);
//    return ResponseEntity.ok(noticeList);
//  }

  //class에 teacher를 할당 (담임선생님)
  // Assign a teacher to a class
  @PutMapping("/class/{classId}/assignTeacher/{loginId}")
  public ResponseEntity<?> assignTeacherToClass(@PathVariable Long classId,
      @PathVariable String loginId) {
    AssignClassResponseDTO assignClassResponseDTO = classService.assignTeacher(classId, loginId);
    return ResponseEntity.ok(assignClassResponseDTO);

  }

}
