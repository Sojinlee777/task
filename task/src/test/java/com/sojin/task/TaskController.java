package com.sojin.task;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    // 일정 불러오기
    @GetMapping("/{taskNumber}")
    public String getTask(@PathVariable Long taskNumber) {
        // 불러오기 로직 작성
        return "Task #" + taskNumber;
    }

    // 일정 작성하기
    @PostMapping
    public String createTask(@RequestBody TaskRequest request) {
        // 작성 로직 작성
        return "Task created: " + request.getName();
    }

    // 일정 수정하기
    @PatchMapping("/{taskNumber}")
    public String updateTask(@PathVariable Long taskNumber, @RequestBody TaskRequest request) {
        // 수정 로직 작성
        return "Task #" + taskNumber + " updated: " + request.getName();
    }

    // 일정 삭제하기
    @DeleteMapping("/{taskNumber}")
    public String deleteTask(@PathVariable Long taskNumber) {
        // 삭제 로직 작성
        return "Task #" + taskNumber + " deleted";
    }
}
