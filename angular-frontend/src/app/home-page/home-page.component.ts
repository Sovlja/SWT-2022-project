import { Component } from '@angular/core';
import {AuthServiceService} from "../Services/auth.service.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent {

  constructor(
    private authService: AuthServiceService,
    private router: Router,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder
  ) {
    if(this.authService.isAuthenticated())
    {

    }
    else {
      let returnUrl : String;
      returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
      this.router.navigate([returnUrl]);
    }

  }



  myFunction()
  {
    let returnUrl : String;
    returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/passchange';
    this.router.navigate([returnUrl]);
  }
  LogOut()
  {
    let returnUrl : String;
    localStorage.clear();
    returnUrl = this.route.snapshot.queryParams['returnUrl'] || '/';
    this.router.navigate([returnUrl]);
  }
}
