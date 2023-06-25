import { Component } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {PostService} from "../Services/post.service";
import {FormControl, FormGroup} from "@angular/forms";
import {AuthServiceService} from "../Services/auth.service.service";
import {UserServiceService} from "../user-service.service";
@Component({
  selector: 'app-my-profile',
  templateUrl: './my-profile.component.html',
  styleUrls: ['./my-profile.component.css']
})
export class MyProfileComponent {

  constructor(private _Activatedroute:ActivatedRoute, private router: Router, private userService : UserServiceService, private authService : AuthServiceService) {


    if(this.authService.isAuthenticated())
    {

    }
    else {
      let returnUrl : String;
      returnUrl = this._Activatedroute.snapshot.queryParams['returnUrl'] || '/';
      this.router.navigate([returnUrl]);
    }
  }
  forma :any;
  async ngOnInit() {


      this.forma = new FormGroup({
        id: new FormControl(this.userService.),
        content: new FormControl(this.user.content),

      });
      this.b=1;
    });

  }
  id :any;
  user:any;
  b= 0;

  submitted = false;

  /**
   * Notification message from received
   * form request or router
   */




  private returnUrl: any;
  public a: any;
  back()
  {
    let returnUrl : String;
    returnUrl = this._Activatedroute.snapshot.queryParams['returnUrl'] || '/';
    this.router.navigate([returnUrl+"/HomePage"]);
  }
  onSubmit() {
    /**
     * Innocent until proven guilty
     */

    this.submitted = true;
    console.warn('Your order has been submitted', this.forma.value);
    this.postService.save(this.forma.value);
  }
}
