// package com.example.dietchartmanagement.Security;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;

// import com.example.dietchartmanagement.Beans.user;
// import com.example.dietchartmanagement.Repository.userrepository;

// public class UserdetailServiceImpl implements UserDetailsService {
//     @Autowired
//         userrepository userrepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
//         user user=userrepository.getuserByName(username);
        
//         if(user==null){
//             throw new UsernameNotFoundException("Could not found UserName");
//         }

//         CustomUser customUser=new CustomUser(user);

//         return customUser;
//     }
    
// }
