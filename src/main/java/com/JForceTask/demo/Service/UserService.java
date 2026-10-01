package com.JForceTask.demo.Service;

import com.JForceTask.demo.Entity.Feedback;
import com.JForceTask.demo.Entity.User;
import com.JForceTask.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
public UserRepo userRepo;



/// register
public User saveUser(User user){
    return userRepo.save(user);

}


/// login

public String loginUser(String email , String password){

                User user = userRepo.findByEmail(email).orElseThrow(null);

                if (user == null){
                    return "User not found";
                }
                if (user.getPassword().equals(password)){
                  return "login ";
                }else {
                    return "invalid password";
                }



            }


            /// feedback
            public User saveFeedback(Long userId, Feedback feedback) {

                User user = userRepo.findById(userId)
                        .orElseThrow(() -> new RuntimeException("User not found"));

                user.getFeedbacks().add(feedback);

                return userRepo.save(user);
            }

    /// edit feedback

//public User updateFeedback(Long userId, Long feedbackId, Feedback feedback) {
//
//    User user = userRepo.findById(userId)
//            ("User not found"));
//
//    Feedback oldFeedback = user.getFeedbacks().stream()
//            .filter(f -> f.getId().equals(feedbackId))
//            )
//            .orElseThrow(() -> new RuntimeException("Feedback not found"));
//
//    oldFeedback.setMessage(feedback.getMessage());
//    oldFeedback.setSubject(feedback.getSubject());
//    oldFeedback.setRating(feedback.getRating());
//
//    return userRepo.save(user);
//}
//
        }


