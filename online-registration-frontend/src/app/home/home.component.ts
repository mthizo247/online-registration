import {Component, OnInit} from '@angular/core';
import {first} from 'rxjs/operators';
import {UserService} from '../_services';

@Component({templateUrl: 'home.component.html'})
export class HomeComponent implements OnInit {
    users = [];

    constructor(
        private userService: UserService
    ) {
    }

    ngOnInit() {
        this.loadAllUsers();
    }

    private loadAllUsers() {
        this.userService.getAll()
            .pipe(first())
            .subscribe(users => this.users = users);
    }
}