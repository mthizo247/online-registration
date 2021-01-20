import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {DataTableModule} from "angular-6-datatable";

import {appRoutingModule} from './app.routing';
import {AppComponent} from './app.component';
import {HomeComponent} from './home';
import {RegisterComponent} from './register';

@NgModule({
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        HttpClientModule,
        appRoutingModule,
        DataTableModule
    ],
    declarations: [
        AppComponent,
        HomeComponent,
        RegisterComponent
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
};