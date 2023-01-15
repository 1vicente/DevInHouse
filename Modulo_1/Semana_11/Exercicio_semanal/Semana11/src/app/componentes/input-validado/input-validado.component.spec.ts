import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InputValidadoComponent } from './input-validado.component';

describe('InputValidadoComponent', () => {
  let component: InputValidadoComponent;
  let fixture: ComponentFixture<InputValidadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InputValidadoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InputValidadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
